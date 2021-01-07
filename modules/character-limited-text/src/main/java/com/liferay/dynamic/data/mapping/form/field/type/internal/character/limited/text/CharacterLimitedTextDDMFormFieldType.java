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

package com.liferay.dynamic.data.mapping.form.field.type.internal.character.limited.text;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.description=character-limited-text-description",
		"ddm.form.field.type.display.order:Integer=13",
		"ddm.form.field.type.group=customized", "ddm.form.field.type.icon=text",
		"ddm.form.field.type.label=character-limited-text-label",
		"ddm.form.field.type.name=characterLimitedText"
	},
	service = DDMFormFieldType.class
)
public class CharacterLimitedTextDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public Class<? extends DDMFormFieldTypeSettings>
		getDDMFormFieldTypeSettings() {

		return CharacterLimitedTextDDMFormFieldTypeSettings.class;
	}

	@Override
	public String getModuleName() {
		return _npmResolver.resolveModuleName(
			"dynamic-data-character-limited-text-form-field" +
				"/character-limited-text.es");
	}

	@Override
	public String getName() {
		return "characterLimitedText";
	}

	@Override
	public boolean isCustomDDMFormFieldType() {
		return true;
	}

	@Reference
	private NPMResolver _npmResolver;

}