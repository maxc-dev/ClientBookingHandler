package dev.maxc.ui.util

import javafx.scene.control.TextField

object InputValidation {
    fun isNotEmpty(vararg fields: TextField) : Boolean {
        for (field in fields) {
            if (field.text.isBlank()) {
                return false
            }
        }
        return true
    }
}