import React from 'react';
import Calculator from '../containers/Calculator';
import {render, fireEvent} from '@testing-library/react';

describe('Calculator', () => {
  let container;
  beforeEach(() => {
    container = render(<Calculator/>)
  })

  it('should change running total on number enter', () => {
    const button4 = container.getByTestId('number4');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual('4');
  })

  it('should be able to add numbers', () => {
    const button1 = container.getByTestId('number1');
    const button4 = container.getByTestId('number4');
    const addButton = container.getByTestId('operator-add');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
  
    fireEvent.click(button1);
    fireEvent.click(addButton);
    fireEvent.click(button4);
    fireEvent.click(equalsButton);
  
    expect(runningTotal.textContent).toEqual('5');
  });

  it('should be able to subtract numbers', () => {
    const button4 = container.getByTestId('number4');
    const button7 = container.getByTestId('number7');
    const subtractButton = container.getByTestId('operator-subtract');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');

    fireEvent.click(button7);
    fireEvent.click(subtractButton);
    fireEvent.click(button4);
    fireEvent.click(equalsButton);

    expect(runningTotal.textContent).toEqual('3');
  })

  it('should be able to multiply numbers', () => {
    const button3 = container.getByTestId('number3');
    const button5 = container.getByTestId('number5');
    const multiplyButton = container.getByTestId('operator-multiply');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');

    fireEvent.click(button3);
    fireEvent.click(multiplyButton);
    fireEvent.click(button5);
    fireEvent.click(equalsButton);

    expect(runningTotal.textContent).toEqual('15');

  })

  it('should be able to divide numbers', () => {
    const button2 = container.getByTestId('number2');
    const button1 = container.getByTestId('number1');
    const divideButton = container.getByTestId('operator-divide');
    const button7 = container.getByTestId('number7');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');

    fireEvent.click(button2);
    fireEvent.click(button1);
    fireEvent.click(divideButton);
    fireEvent.click(button7);
    fireEvent.click(equalsButton);

    expect(runningTotal.textContent).toEqual('3');
  })
  
  it('should be able to concatenate muitiple number button clicks', () => {
    const button2 = container.getByTestId('number2');
    const button1 = container.getByTestId('number1');
    const button7 = container.getByTestId('number7');
    const runningTotal = container.getByTestId('running-total');

    fireEvent.click(button2);
    fireEvent.click(button1);
    fireEvent.click(button7);

    expect(runningTotal.textContent).toEqual('217');
  })

  it('should be able to chain muitiple operations together', () => {
    const button7 = container.getByTestId('number7');
    const addButton = container.getByTestId('operator-add');
    const button1 = container.getByTestId('number1');
    const subtractButton = container.getByTestId('operator-subtract');
    const button2 = container.getByTestId('number2');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');


    fireEvent.click(button7);
    fireEvent.click(addButton);
    fireEvent.click(button1);
    fireEvent.click(subtractButton);
    fireEvent.click(button2);
    fireEvent.click(equalsButton);

    expect(runningTotal.textContent).toEqual('6')
  })

  it('should clear the running total without affecting the calculation', () => {
    const button7 = container.getByTestId('number7');
    const addButton = container.getByTestId('operator-add');
    const button1 = container.getByTestId('number1');
    const equalsButton = container.getByTestId('operator-equals');
    const clear = container.getByTestId('clear');
    const runningTotal = container.getByTestId('running-total');

    fireEvent.click(button7)
    fireEvent.click(addButton)
    fireEvent.click(button1)
    fireEvent.click(equalsButton)
    fireEvent.click(clear)
    expect(runningTotal.textContent).toEqual('0')
    fireEvent.click(addButton)
    fireEvent.click(button1)
    fireEvent.click(equalsButton)
    expect(runningTotal.textContent).toEqual('9')

  })
})

