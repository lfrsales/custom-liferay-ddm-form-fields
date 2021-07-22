import React, {useEffect} from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';

import './image-checkbox.css'; 

/**
 * Image Checkbox React Component
 * 
 * author: mdominguez
 */

const ImageCheckbox = ({
	checked: initialChecked,
	disabled,
	imageCheckbox,
	name,
	onChange,
	required,
	visible
}) => {

	const [checked, setChecked] = useSyncValue(initialChecked, true);

	let imageCheckboxJson = imageCheckbox;
	if (imageCheckboxJson && (typeof imageCheckboxJson === 'string' || imageCheckboxJson instanceof String)) {
		imageCheckboxJson = JSON.parse(imageCheckbox);
	}

	useEffect(() => {
		setChecked(initialChecked);
	}, [disabled, visible]);
	
	return (
		<label className="ddm-image-checkbox image-checkbox">
			<img 
				src={imageCheckboxJson.url} 
				alt={imageCheckboxJson.alt}

			/>
			<input
				checked={checked}
				className="image-checkbox-check"
				disabled={disabled}
				name={name}
				onChange={(event) => {
					setChecked(event.target.checked);
					onChange(event, event.target.checked);
					event.target.parentNode.classList.toggle('checked');
				}}
				type="checkbox"
				required={required}
				value={true}
			/>
		</label>
	);	
}

const Main = ({
	disabled,
	imageCheckbox,
	label,
	name,
	onChange,
	predefinedValue = true,
	required,
	value,
	visible,
	...otherProps
}) => (
	<FieldBase
		label={label}
        name={name}
        predefinedValue={predefinedValue}
		required={required}
		visible={visible}
		{...otherProps}
	>
        <ImageCheckbox 
        	checked={value !== undefined ? value : predefinedValue}
        	disabled={disabled}
			imageCheckbox={imageCheckbox}
            name={name}
            onChange={onChange}
        	required={required}
        	visible={visible}
        />
    </FieldBase>
)

Main.displayName = 'ImageCheckbox';

export default Main;
