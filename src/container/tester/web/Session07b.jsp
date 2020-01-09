<%--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.

--%><%@ page contentType="text/plain" %><jsp:useBean id="simpleBean"
    scope="session" class="org.apache.tester.SessionBean"/><%
  if ("From Session07a".equals(simpleBean.getStringProperty())) {
    out.println("Session07 PASSED");
  } else {
    out.println("Session07 FAILED - Property = '" +
                simpleBean.getStringProperty() + "'");
  }
%>
