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

package org.jbpm.workbench.ht.model.events;

import java.io.Serializable;

public abstract class AbstractTaskEvent implements Serializable {

    private String serverTemplateId;
    private String containerId;
    private Long taskId;
    private String taskName;

    public AbstractTaskEvent() {
    }

    public AbstractTaskEvent(String serverTemplateId,
                             String containerId,
                             Long taskId) {
        this(serverTemplateId,
             containerId,
             taskId,
             null);
    }

    public AbstractTaskEvent(String serverTemplateId,
                             String containerId,
                             Long taskId,
                             String taskName) {
        this.serverTemplateId = serverTemplateId;
        this.containerId = containerId;
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public String getServerTemplateId() {
        return serverTemplateId;
    }

    public void setServerTemplateId(String serverTemplateId) {
        this.serverTemplateId = serverTemplateId;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "AbstractTaskEvent{" +
                "serverTemplateId='" + serverTemplateId + '\'' +
                ", containerId='" + containerId + '\'' +
                ", taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                '}';
    }
}
