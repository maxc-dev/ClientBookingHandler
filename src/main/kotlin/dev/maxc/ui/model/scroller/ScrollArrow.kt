package dev.maxc.ui.model.scroller

import dev.maxc.App
import javafx.geometry.Pos
import javafx.scene.Cursor
import javafx.scene.Group
import javafx.scene.image.ImageView
import javafx.scene.layout.StackPane


/**
 * @author Max Carter
 * @since 22/06/2020
 */
class ScrollArrow(controller: PaneScrollerController, right: Boolean) :
    Group() {
    init {
        val mainPane = StackPane()
        mainPane.prefHeight = 40.0
        mainPane.prefWidth = 40.0
        mainPane.id = "sideBarCategoryPane"
        mainPane.alignment = Pos.CENTER
        mainPane.cursor = Cursor.HAND
        children.add(mainPane)

        val arrowDisplay = ImageView(App::class.java.getResource("/icons/arrow_${if (right) "right" else "left"}.png").toExternalForm())
        mainPane.children.add(arrowDisplay)

        setOnMouseReleased {
            controller.onFeaturedPaneScrolled(right)
        }
    }
}