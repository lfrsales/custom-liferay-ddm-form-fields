package com.liferay.dynamic.data.mapping.form.field.type.internal.character.limited.text;

import com.liferay.dynamic.data.mapping.annotations.DDMForm;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayout;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutColumn;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutPage;
import com.liferay.dynamic.data.mapping.annotations.DDMFormLayoutRow;
import com.liferay.dynamic.data.mapping.form.field.type.DefaultDDMFormFieldTypeSettings;

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
								"label", "predefinedValue", "required", "tip"
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
								"dataType", "characterLimit", "name", "showLabel", "repeatable",
								"type", "validation", "visibilityExpression"
							}
						)
					}
				)
			}
		)
	}
)
public interface CharacterLimitedTextDDMFormFieldTypeSettings extends DefaultDDMFormFieldTypeSettings {

	@DDMFormField(
		label = "%character-limit",
		predefinedValue = "100",
		properties = {
			"placeholder=%enter-the-character-limit-for-the-input"
		},
		type = "numeric"
	)
	public String characterLimit();

}
