package lexer.model;

public enum TokenType {
        MINUS("-"),
        PLUS("+");
        private final String rep;

        TokenType(String text){
                rep = text;
        }

        public String getRep() {
                return rep;
        }
//        PLUS,
//        MULTIPLY,
//        DIVIDE,
//        GREATER_EQUAL,
//        GREATER,
//        LESS_EQUAL,
//        LESS,
//        IDENTIFIER,
//        STRING,
//        NUMBER,
//        BOOLEAN,
//        PRINT,
//        LET,
//        CONST,
//        IF,
//        ELSE,
//        NUMBER_TYPE,
//        STRING_TYPE,
//        BOOLEAN_TYPE,
//        SEMICOLON,
//        COLON,
//        ASSIGNATION,
//        LEFT_PAREN,
//        RIGHT_PAREN,
//        LEFT_CURLY_BRACES,
//        RIGHT_CURLY_BRACES,
//        EOF,
    }
