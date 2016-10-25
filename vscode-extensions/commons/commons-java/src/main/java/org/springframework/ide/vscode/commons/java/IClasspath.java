/*******************************************************************************
 * Copyright (c) 2016 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.vscode.commons.java;

import java.nio.file.Path;
import java.util.Collection;

/**
 * Classpath for a Java artifact
 * 
 * @author Kris De Volder
 * @author Alex Boyko
 *
 */
public interface IClasspath {

	/**
	 * Classpath entries paths
	 * 
	 * @return collection of classpath entries in a form file/folder paths
	 * @throws Exception
	 */
	Collection<Path> getClasspathEntries() throws Exception;

}
