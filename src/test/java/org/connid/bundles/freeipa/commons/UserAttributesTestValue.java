/**
 * ====================
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2008-2009 Sun Microsystems, Inc. All rights reserved.
 * Copyright 2011-2013 Tirasa. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Common Development
 * and Distribution License("CDDL") (the "License"). You may not use this file
 * except in compliance with the License.
 *
 * You can obtain a copy of the License at https://oss.oracle.com/licenses/CDDL
 * See the License for the specific language governing permissions and limitations
 * under the License.
 *
 * When distributing the Covered Code, include this CDDL Header Notice in each file
 * and include the License file at https://oss.oracle.com/licenses/CDDL.
 * If applicable, add the following below this CDDL Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * ====================
 */
package org.connid.bundles.freeipa.commons;

import org.identityconnectors.common.security.GuardedString;

public class UserAttributesTestValue {

    public static final String uid = "utente.test";

    public static final GuardedString userPassword = new GuardedString("password".toCharArray());

    public static final GuardedString newUserPassword = new GuardedString("newpassword".toCharArray());

    public static final String givenName = "Utente";

    public static final String sn = "Test";

    public static final String initials = "UT";
    
    public static final String newInitials = "NI";

    public static final String mail = "utente.test@example.com";
    
    public static final String not_exists = "NOT_EXISTS";

}
