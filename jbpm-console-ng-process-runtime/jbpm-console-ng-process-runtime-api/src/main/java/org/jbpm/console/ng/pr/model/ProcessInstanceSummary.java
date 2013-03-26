/*
 * Copyright 2012 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.console.ng.pr.model;

import java.io.Serializable;
import org.jboss.errai.common.client.api.annotations.Portable;

/**
 *
 * @author salaboy
 */
@Portable
public class ProcessInstanceSummary implements Serializable {
    private long id;
    private String processId;
    private String processName;
    private String processVersion;
    private int state;
    private long startTime;
    private String domainId;

    public ProcessInstanceSummary(long id, String processId, String domainId,  String processName, 
            String processVersion, int state, long startTime) {
        super();
        this.id = id;
        this.processId = processId;
        this.processName = processName;
        this.domainId = domainId;
        this.processVersion = processVersion;
        this.state = state;
        this.startTime = startTime;
    }

    public ProcessInstanceSummary() {
    }

    public long getId() {
        return id;
    }

    public String getProcessId() {
        return processId;
    }

    public String getProcessName() {
        return processName;
    }

    public int getState() {
        return state;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getProcessVersion() {
        return processVersion;
    }

    public void setProcessVersion(String processVersion) {
        this.processVersion = processVersion;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }
    
    
}
