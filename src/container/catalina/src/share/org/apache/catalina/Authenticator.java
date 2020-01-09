/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.catalina;


/**
 * An <b>Authenticator</b> is a component (usually a Valve or Container) that
 * provides some sort of authentication service.  The interface itself has no
 * functional significance,  but is used as a tagging mechanism so that other
 * components can detect the presence (via an "instanceof Authenticator" test)
 * of an already configured authentication service.
 *
 * @author Craig R. McClanahan
 * @version $Revision: 466608 $ $Date: 2006-10-21 17:10:15 -0600 (Sat, 21 Oct 2006) $
 */

public interface Authenticator {


}
