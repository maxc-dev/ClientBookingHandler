package dev.maxc.ui.model.progressbar

import dev.maxc.App
import javafx.geometry.Pos
import javafx.scene.Group
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.scene.paint.Color
import javafx.scene.text.Font


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBarNode(title: String = "") : Group() {
    private val titleDisplayLabel = Label(title)
    private val statusDisplayImage = ImageView(App::class.java.getResource("/icons/unchecked.png").toExternalForm())

    /**
     * If the progress bar node is checked it will display a filled in check box
     * when unchecked it will display an unfilled check box
     */
    var checked: Boolean = false
        set(value) {
            field = value
            statusDisplayImage.image =
                Image(App::class.java.getResource("/icons/${if (value) "" else "un"}checked.png").toExternalForm())
        }

    init {
        val displayImgLabel = VBox(5.0, statusDisplayImage, titleDisplayLabel)
        displayImgLabel.alignment = Pos.CENTER
        children.add(displayImgLabel)

        titleDisplayLabel.textFill = Color.WHITE
        titleDisplayLabel.font = Font("Roboto", 20.0)
    }
}