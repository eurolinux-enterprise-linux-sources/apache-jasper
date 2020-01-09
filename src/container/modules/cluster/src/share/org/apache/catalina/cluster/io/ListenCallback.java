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

package org.apache.catalina.cluster.io;

import org.apache.catalina.cluster.tcp.ClusterData ;

/**
 * The listen callback interface is used by the replication system
 * when data has been received. The interface does not care about
 * objects and marshalling and just passes the bytes straight through.
 * @author Filip Hanik
 * @author Peter Rossbach
 * @version $Revision: 466608 $, $Date: 2006-10-21 17:10:15 -0600 (Sat, 21 Oct 2006) $
 */
public interface ListenCallback
{
    /**
     * This method is invoked on the callback object to notify it that new data has
     * been received from one of the cluster nodes.
     * @param data - the message bytes received from the cluster/replication system
     */
     public void messageDataReceived(ClusterData data);
     
    /** receiver must be send ack
      */
     public boolean isSendAck() ;
     
     /** send ack
      *
      */
     public void sendAck() throws java.io.IOException ;

}