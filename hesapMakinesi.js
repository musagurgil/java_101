// HTML dosyasında bir <div> elementi oluşturun ve ona id="calculator" verin.
// Ardından aşağıdaki JavaScript kodunu kullanarak hesap makinesini oluşturun.

// Hesap makinesi elementini alın
const calculator = document.getElementById("calculator");

// İşlem yapılacak sayıları tutmak için değişkenler
let num1 = "";
let num2 = "";

// İşlem türünü ve sonucu tutmak için değişkenler
let operator = "";
let result = "";

// Sayı tuşlarına tıklandığında
function handleNumberClick(number) {
  if (operator === "") {
    num1 += number;
  } else {
    num2 += number;
  }
}

// İşlem tuşlarına tıklandığında
function handleOperatorClick(op) {
  if (num1 !== "" && num2 !== "") {
    calculate();
  }
  operator = op;
}

// Eşittir tuşuna tıklandığında
function handleEqualsClick() {
  if (num1 !== "" && num2 !== "") {
    calculate();
    operator = "";
  }
}

// Temizle tuşuna tıklandığında
function handleClearClick() {
  num1 = "";
  num2 = "";
  operator = "";
  result = "";
}

// Hesaplama işlemini gerçekleştirir
function calculate() {
  const n1 = parseFloat(num1);
  const n2 = parseFloat(num2);

  switch (operator) {
    case "+":
      result = n1 + n2;
      break;
    case "-":
      result = n1 - n2;
      break;
    case "*":
      result = n1 * n2;
      break;
    case "/":
      result = n1 / n2;
      break;
    default:
      result = "";
  }

  displayResult();
}

// Sonucu ekranda gösterir
function displayResult() {
  const resultElement = document.createElement("p");
  resultElement.textContent = `Sonuç: ${result}`;

  calculator.appendChild(resultElement);
}

// Tuşlara tıklamaları dinle
const numberButtons = document.querySelectorAll(".number");
numberButtons.forEach((button) => {
  button.addEventListener("click", () => {
    handleNumberClick(button.textContent);
  });
});

const operatorButtons = document.querySelectorAll(".operator");
operatorButtons.forEach((button) => {
  button.addEventListener("click", () => {
    handleOperatorClick(button.textContent);
  });
});

const equalsButton = document.getElementById("equals");
equalsButton.addEventListener("click", handleEqualsClick);

const clearButton = document.getElementById("clear");
clearButton.addEventListener("click", handleClearClick);
