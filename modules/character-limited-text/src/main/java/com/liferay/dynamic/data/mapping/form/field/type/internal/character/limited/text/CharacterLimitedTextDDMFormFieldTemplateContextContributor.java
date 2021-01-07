package com.liferay.dynamic.data.mapping.form.field.type.internal.character.limited.text;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTemplateContextContributor;
import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.render.DDMFormFieldRenderingContext;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author evanthibodeau
 */
@Component(
	immediate = true,
	property = "ddm.form.field.type.name=characterLimitedText",
	service = {
		DDMFormFieldTemplateContextContributor.class,
		CharacterLimitedTextDDMFormFieldTemplateContextContributor.class
	}
)
public class CharacterLimitedTextDDMFormFieldTemplateContextContributor
	implements DDMFormFieldTemplateContextContributor {

		@Override
	public Map<String, Object> getParameters(
		DDMFormField ddmFormField,
		DDMFormFieldRenderingContext ddmFormFieldRenderingContext) {

		Map<String, Object> parameters = new HashMap<>();

		parameters.put("characterLimit",
			(String)ddmFormField.getProperty("characterLimit"));

		return parameters;
	}
}
