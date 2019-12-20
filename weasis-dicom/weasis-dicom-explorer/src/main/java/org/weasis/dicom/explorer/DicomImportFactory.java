/*******************************************************************************
 * Copyright (c) 2009-2020 Nicolas Roduit and other contributors.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.weasis.dicom.explorer;

import java.util.Hashtable;

public interface DicomImportFactory {

    ImportDicom createDicomImportPage(Hashtable<String, Object> properties);

}