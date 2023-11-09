let display = document.getElementsByClassName("display");
let previousNumber = null;
let currrentSymbol = null;
let operation = false;

window.addEventListener("load", (event) => {
    onLoad();
})

onLoad = () => {
    display = document.getElementsByClassName("display")[0];
    let items = document.getElementsByClassName('calc-button');
    for (let i = 0; i < items.length; i++) {
        items[i].addEventListener("click", (event) => {
            onClick(items[i].innerText);
        })
    }
}

onClick = (value) => {
    if (isNaN(value)) {
        handleSymbol(value);
    }
    else {
        handleNumber(value);
    }
}

const handleNumber = (number) => {
    if (currrentSymbol != null) {
        if (operation) {
            operation = false;
            display.innerText = number;
            return;
        }
    }
    if (parseFloat(display.innerText) == 0) {
        display.innerText = number;
        return;
    }
    display.innerText += number;
}

const handleOperation = () => {
    switch (currrentSymbol) {
        case "×":
            return formatNumberWithFourDecimalPlaces(previousNumber * parseFloat(display.innerText));
        case "÷":
            return formatNumberWithFourDecimalPlaces(previousNumber / parseFloat(display.innerText));
        case "+":
            return formatNumberWithFourDecimalPlaces(previousNumber + parseFloat(display.innerText));
        case "−":
            return formatNumberWithFourDecimalPlaces(previousNumber - parseFloat(display.innerText));
    }
}

formatNumberWithFourDecimalPlaces = (number) => {
    let formattedNumber = number.toFixed(4);
    while (formattedNumber.includes('.') && (formattedNumber.endsWith('0') || formattedNumber.endsWith('.'))) {
        formattedNumber = formattedNumber.slice(0, -1);
    }
    return formattedNumber;
}

const handleSymbol = (symbol) => {
    let screen = display.innerText;
    switch (symbol) {
        case "AC":
            previousNumber = null;
            currrentSymbol = null;
            display.innerText = 0;
            break;
        case ".":
            if (screen.includes('.')) {
                return;
            }
            display.innerText += ".";
            break;
        case "←":
            if (parseFloat(screen) == 0) {
                return;
            }
            if (screen.length == 1) {
                display.innerText = 0;
                return;
            }
            display.innerText = screen.slice(0, -1);
            break;
        case "×":
        case "−":
        case "÷":
        case "+":
            if (currrentSymbol != null) {
                previousNumber = handleOperation();
                display.innerText = previousNumber;
                operation = true;
                currrentSymbol = symbol;
                return;
            }
            currrentSymbol = symbol;
            operation = true;
            previousNumber = parseFloat(screen);
            break;
        case "=":
            console.log(currrentSymbol, previousNumber, screen)
            result = handleOperation();
            display.innerText = result;
            break;
    }
}