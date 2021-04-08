/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.form.field.type.internal.userdata.field.form.field;

import com.liferay.dynamic.data.mapping.annotations.DDMForm;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayout;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.form.field.type.DefaultDDMFormFieldTypeSettings;

/**
 * @author mdominguez
 */
@DDMForm
@DDMFormLayout(
	paginationMode = com.liferay.dynamic.data.mapping.model.DDMFormLayout.TABBED_MODE,
	value = {
		@DDMFormLayoutPage(
			title = "%basic",
			value = {
				@DDMFormLayoutRow(
					{
						@DDMFormLayoutColumn(
							size = 12,
							value = {
								"label", "userDataField", "required", "tip"
							}
						)
					}
				)
			}
		),
		@DDMFormLayoutPage(
			title = "%advanced",
			value = {
				@DDMFormLayoutRow(
					{
						@DDMFormLayoutColumn(
							size = 12,
							value = {
								"dataType", "name", "showLabel", "repeatable",
								"type", "validation", "visibilityExpression"
							}
						)
					}
				)
			}
		)
	}
)
public interface UserDataFieldDDMFormFieldTypeSettings
	extends DefaultDDMFormFieldTypeSettings {

	@DDMFormField(
		label = "%user-data-field",
		optionLabels = {
			"%full-name", "%first-name", "%middle-name", "%last-name",
			"%date-of-birth", "%job-title", "%email", "%phone", "%address",
			"%street1", "%street2", "%street3", "%city", "%country-id",
			"%country-name", "%region-id", "%region-code", "%postal-code"
		},
		optionValues = {
			"getFullName", "getFirstName", "getMiddleName", "getLastName",
			"getDateOfBirth", "getJobTitle", "getEmailAddress", "getPhones",
			"getAddresses", "getStreet1", "getStreet2", "getStreet3", "getCity",
			"getCountryId", "getCountryName", "getRegionId", "getRegionCode",
			"getPostalCode"
		},
		predefinedValue = "full-name", required = true, type = "select"
	)
	public String userDataField();

}