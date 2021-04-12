import React, {useEffect} from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';
import {ClayInput} from '@clayui/form';

/**
 * UserData Input React Component
 */

const UserDataFieldDDMFormFieldType = (props) => {
	const {
		disabled,
		id,
		name,
		onBlur,
		onChange,
		onFocus,
		value: initialValue,
	} = props;

	const [value, setValue] = useSyncValue(initialValue, true);

	useEffect(() => {
		setValue(initialValue);
	}, [initialValue, setValue]);

	return (
		<ClayInput
			className="ddm-field-text"
			disabled={disabled}
			id={id ? id : name}
			name={name}
			onBlur={onBlur}
			onChange={(event) => {
				setValue(event.target.value);

				onChange(event);
			}}
			onFocus={onFocus}
			type="text"
			value={value}
		/>
	);
};

const Main = props => {
	const {
		disabled,
		id,
		label,
		name,
		onBlur,
		onChange,
		onFocus,
		predefinedValue = '',
		readOnly,
		value,
		...otherProps
	} = props;

	return <FieldBase
			{...otherProps}
			id={id}
			label={label}
			name={name}
			readOnly={readOnly}
		>
			<UserDataFieldDDMFormFieldType
				disabled={disabled || readOnly}
				id={id}
				label={label}
				name={name}
				onBlur={onBlur}
				onChange={onChange}
				onFocus={onFocus}
				predefinedValue={predefinedValue}
				value={value ? value : predefinedValue}
			/>
		</FieldBase>
}

Main.displayName = 'UserDataFieldDDMFormFieldType';

export default Main;
