package com.liferay.dynamic.data.mapping.form.field.type.internal.character.limited.text;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeSettings;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author evanthibodeau
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.description=character-limited-text-description",
		"ddm.form.field.type.display.order:Integer=13",
		"ddm.form.field.type.group=customized",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.label=character-limited-text-label",
		"ddm.form.field.type.name=characterLimitedText"
	},
	service = DDMFormFieldType.class
)
public class CharacterLimitedTextDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getModuleName() {
		return _npmResolver.resolveModuleName(
			"dynamic-data-character-limited-text-form-field/character-limited-text.es");
	}

	@Override
	public String getName() {
		return "characterLimitedText";
	}
	
	@Override
	public Class<? extends DDMFormFieldTypeSettings>
		getDDMFormFieldTypeSettings() {

		return CharacterLimitedTextDDMFormFieldTypeSettings.class;
	}

	@Override
	public boolean isCustomDDMFormFieldType() {
		return true;
	}

	@Reference
	private NPMResolver _npmResolver;

}