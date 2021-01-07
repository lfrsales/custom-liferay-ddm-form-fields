import React from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';


const CharacterLimitedText = ({name, onChange, predefinedValue, readOnly, value}) =>
		<input
			className="ddm-field-character-limited-text form-control character-limited-text"
			disabled={readOnly}
			name={name}
			onInput={onChange}
			type="text"
			value={value ? value : predefinedValue}/>

const Main = ({label, name, onChange, predefinedValue, readOnly, value, ...otherProps}) =>{

	const [currentValue, setCurrentValue] = useSyncValue(
		value ? value : predefinedValue
	);

	return <FieldBase
			label={label}
			name={name}
			predefinedValue={predefinedValue}
			{...otherProps}
		>
			<CharacterLimitedText
				name={name}
				onChange={(event) => {
					setCurrentValue(event.target.value);
					onChange(event);
				}}
				predefinedValue={predefinedValue}
				readOnly={readOnly}
				value={currentValue}
			/>
		</FieldBase>
}

Main.displayName = 'CharacterLimitedText';

export default Main;


