package dev.maxc.ui.scroller.progressbar

import dev.maxc.App
import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBarNode(title: String = "") : Pane() {
    private var titleDisplayLabel = Label(title)
    private var statusDisplayImage = ImageView(Image(App::class.java.getResource("/icons/unchecked.png").file))

    /**
     * If the progress bar node is checked it will display a filled in check box
     * when unchecked it will display an unfilled check box
     */
    var checked: Boolean = false
        set(value) {
            field = value
            statusDisplayImage.image =
                Image(App::class.java.getResource("/icons/${if (value) "" else "un"}checked.png").file)
        }

    init {
        val displayImgLabel = VBox(statusDisplayImage, titleDisplayLabel)
        displayImgLabel.alignment = Pos.CENTER
        children.add(displayImgLabel)
        id = "css-id" //todo create css for the progress bar node
    }
}