/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.forms.display.backend.provider;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.workbench.forms.service.providing.TaskRenderingSettings;
import org.jbpm.workbench.forms.service.providing.model.TaskDefinition;
import org.junit.runner.RunWith;
import org.kie.workbench.common.forms.dynamic.service.context.generation.dynamic.BackendFormRenderingContextManager;
import org.kie.workbench.common.forms.jbpm.service.bpmn.DynamicBPMNFormGenerator;
import org.kie.workbench.common.forms.services.backend.serialization.FormDefinitionSerializer;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TaskFormValuesProcessorWithWrongTypesTest extends AbstractFormsValuesProcessorWithWrongTypesTest<TaskFormValuesProcessor, TaskRenderingSettings> {

    @Mock
    protected TaskDefinition task;

    @Override
    public void init() {
        super.init();

        when(task.getFormName()).thenReturn("modify");

        when(task.getTaskInputDefinitions()).thenReturn(variables);
        when(task.getTaskOutputDefinitions()).thenReturn(variables);
    }

    @Override
    TaskRenderingSettings getRenderingSettingsWithoutForms() {

        Map<String, Object> inputs = new HashMap<>();

        inputs.put(ID, new Long(123));
        inputs.put(NAME, "John Snow");

        return new TaskRenderingSettings(task,
                                         inputs,
                                         new HashMap<>(),
                                         SERVER_TEMPLATE_ID,
                                         null,
                                         marshallerContext);
    }

    @Override
    TaskFormValuesProcessor getProcessorInstance(FormDefinitionSerializer serializer, BackendFormRenderingContextManager backendFormRenderingContextManager, DynamicBPMNFormGenerator dynamicBPMNFormGenerator) {
        return new TaskFormValuesProcessor(serializer,
                                           backendFormRenderingContextManager,
                                           dynamicBPMNFormGenerator);
    }
}
