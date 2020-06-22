package dev.maxc.ui.scroller

import dev.maxc.App
import javafx.scene.image.Image
import javafx.scene.image.ImageView


/**
 * @author Max Carter
 * @since 22/06/2020
 */
class ScrollArrow(controller: PaneScrollerController, right: Boolean) :
    ImageView(Image(App::class.java.getResource("/icons/arrow_${if (right) "right" else "down"}.png").file)) {

    //todo(add some fancy css and proper image icons)

    init {
        setOnMouseReleased {
            controller.onFeaturedPaneScrolled(right)
        }
    }
}