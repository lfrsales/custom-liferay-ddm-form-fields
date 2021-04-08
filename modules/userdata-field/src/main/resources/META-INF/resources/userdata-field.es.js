import React, {useEffect} from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';
import {ClayInput} from '@clayui/form';

/**
 * UserData Input React Component
 */

const UserDataFieldDDMFormFieldType = ({name, onChange, predefinedValue, readOnly, value}) =>
	<ClayInput
		className="ddm-field-text"
		disabled={readOnly}
		name={name}
		onInput={onChange}
		type="text"
		value={value ? value : predefinedValue}
	/>

const Main = props => {
	const {
		label,
		name,
		onChange,
		predefinedValue = '',
		readOnly,
		value,
		...otherProps
	} = props;

	const [currentValue, setCurrentValue] = useSyncValue(
		value ? value : predefinedValue
	);
	
	useEffect(() => {
		setCurrentValue(predefinedValue);
		onChange({target: {value: predefinedValue}});
	}, []);
	
	return <FieldBase
			label={label}
			name={name}
			predefinedValue={predefinedValue}
			{...otherProps}
		>
			<UserDataFieldDDMFormFieldType
				name={name}
	            onChange={(event) => {
	                setCurrentValue(event.target.value);
	                onChange(event);
	            }}
				readOnly={readOnly}
				predefinedValue={predefinedValue}
				value={currentValue}
			/>
		</FieldBase>
}

Main.displayName = 'UserDataFieldDDMFormFieldType';

export default Main;
