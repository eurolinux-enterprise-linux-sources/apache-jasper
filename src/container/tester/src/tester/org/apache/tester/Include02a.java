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

package org.apache.tester;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Included servlet for the test performed by Include02.
 *
 * @author Craig R. McClanahan
 * @version $Revision: 565210 $ $Date: 2007-08-12 18:01:26 -0600 (Sun, 12 Aug 2007) $
 */

public class Include02a extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        String type = request.getParameter("exception");
	if (type == null)
	    return;
	else if (type.equals("IOException"))
	    throw new IOException("Include02 IOException");
	else if (type.equals("ServletException"))
	    throw new ServletException("Include02 ServletException");
	else if (type.equals("NullPointerException"))
	    throw new NullPointerException("Include02 NullPointerException");

    }

}
