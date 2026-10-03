# Loan EMI Calculator

A simple, interactive console-based Java application to calculate Equated Monthly Installment (EMI), total interest payable, and total loan repayment amount.

---

## 📌 Features

- **Accurate EMI Calculation:** Uses standard financial formula:
  $$E = \frac{P \times r \times (1 + r)^n}{(1 + r)^n - 1}$$
  where:
  - $E$ = Monthly EMI
  - $P$ = Principal Loan Amount
  - $r$ = Monthly Interest Rate (Annual Rate / 12 / 100)
  - $n$ = Loan Tenure in Months (Years $\times$ 12)
- **Zero-Interest Handling:** Accurately handles 0% interest loans.
- **Input Validation:** Validates loan amount, interest rate, and tenure.
- **Formatted Currency Output:** Displays formatted financial numbers with currency symbol (`₹`) and 2-decimal precision.

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK 8 or higher) installed on your system.

### How to Compile & Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/SiddharthK1257/Loan-EMI-Calculator.git
   cd Loan-EMI-Calculator
   ```

2. **Compile the program:**
   ```bash
   javac LoanEMICalculator.java
   ```

3. **Run the application:**
   ```bash
   java LoanEMICalculator
   ```

---

## 💻 Sample Output

```text
========================================
          LOAN EMI CALCULATOR
========================================
Enter Loan Amount (₹): 500000
Enter Annual Interest Rate (%): 8.5
Enter Loan Tenure (Years): 5

========================================
             LOAN SUMMARY
========================================
Loan Amount       : ₹500,000.00
Interest Rate     : 8.50%
Loan Tenure       : 60 months
----------------------------------------
Monthly EMI       : ₹10,258.32
Total Interest    : ₹115,499.30
Total Payment     : ₹615,499.30
========================================
```

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
