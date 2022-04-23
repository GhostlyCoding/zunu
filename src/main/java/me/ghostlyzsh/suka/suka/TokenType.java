package me.ghostlyzsh.suka.suka;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public enum TokenType {
    // single-character tokens
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SLASH, STAR,

    // one or two character tokens
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,

    // literals
    IDENTIFIER, STRING, INT, FLOAT,

    // keywords
    AND, ELSE, FALSE, FN, FOR, IF, OR, SEND,
    RETURN, TRUE, VAR, WHILE,

    EOF
}
