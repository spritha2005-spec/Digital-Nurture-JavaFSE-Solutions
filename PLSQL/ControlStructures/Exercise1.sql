DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Age
        FROM Customers;

BEGIN
    FOR cust_rec IN cust_cursor LOOP

        IF cust_rec.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rate discount applied successfully.');

END;
/
DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Balance
        FROM Customers;

BEGIN
    FOR cust_rec IN cust_cursor LOOP

        IF cust_rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = TRUE
            WHERE CustomerID = cust_rec.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');

END;
/
DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_rec IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || loan_rec.LoanID ||
            ' for Customer ' || loan_rec.CustomerID ||
            ' is due on ' || loan_rec.DueDate
        );

    END LOOP;

END;
/