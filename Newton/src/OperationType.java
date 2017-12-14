/**
 * Created by Lukas Cerny.
 */

/**
 * Zalezi na poradi, nepresouvat
 */
public enum OperationType {
    UNAR_MINUS,
    ADD,        // celociselne scitani (znak +)
    SUB,        // celociselne odecitani (znak -)
    MUL,        // celosicelne nasobeni (znak *)
    DIV,        // celočíselné dělení (znak /)
    MOD,        // dělení modulo (znak %)
    ODD,        // test, zda je číslo liché
    EQ,         // test rovnosti (znak ==)
    NEQ,        // test nerovnosti (znaky !=)
    LT,         // test mensi (znak <)
    GTE,        // test vetsi rovno (znak >=)
    GT,         // test vetsi (znak >)
    LTE,        // test mensi rovno (znak <=)
    ;
}
