package dev.maxc.ui.util

import javafx.scene.control.TextField

object TextFieldUtils {
    fun addTextFieldValidator(vararg fields: TextField) {
        for (field in fields) {
            field.focusedProperty()
                .addListener { _, _, inFocus ->
                    if (!inFocus && field.text.isBlank()) {
                        flagEmpty(field)
                    } else {
                        unFlag(field)
                    }
                }
        }
    }

    fun flagEmpty(field: TextField) {
        field.style += "-fx-background-color: red, #5bc915, #5bc915;"
    }

    fun unFlag(field: TextField) {
        field.style += "-fx-background-color: white, #5bc915, #5bc915;"
    }
}