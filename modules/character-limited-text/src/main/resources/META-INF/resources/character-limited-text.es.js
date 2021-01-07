import React from 'react';
import {FieldBase} from 'dynamic-data-mapping-form-field-type/FieldBase/ReactFieldBase.es';
import {useSyncValue} from 'dynamic-data-mapping-form-field-type/hooks/useSyncValue.es';


const CharacterLimitedInputDDMFormFieldType = ({name, onChange, predefinedValue, readOnly, value}) =>
		<textarea
			className="ddm-field-character-limited-text-input form-control character-limited-text-input"
			disabled={readOnly}
			name={name}
			onInput={onChange}
			type="text"
			value={value ? value : predefinedValue}/>

const Main = props => {
	const {
		characterLimit,
		label,
		name,
		onChange,
		predefinedValue = '',
		readOnly,
		value,
		...otherProps
	} = props;

	console.log('characterLimit', characterLimit);

	const characterLimitInt = characterLimit ? parseInt(characterLimit) : 0;

	console.log('otherProps', otherProps);

	const [currentValue, setCurrentValue] = useSyncValue(
		value ? value : predefinedValue
	);

	return <FieldBase
			label={label}
			name={name}
			predefinedValue={predefinedValue}
			{...otherProps}
		>
			<div className="form-group">
				<CharacterLimitedInputDDMFormFieldType
					name={name}
					onChange={(event) => {
						if (event.target.value.length <= characterLimitInt) {
							setCurrentValue(event.target.value);
							onChange(event);
						}
					}}
					predefinedValue={predefinedValue}
					readOnly={readOnly}
					value={currentValue}
				/>

				<span aria-hidden="true" className="form-text text-right">
					<span>{currentValue.length}</span> / <span>{characterLimitInt}</span>
				</span>
			</div>
		</FieldBase>
}

Main.displayName = 'CharacterLimitedInputDDMFormFieldType';

export default Main;
