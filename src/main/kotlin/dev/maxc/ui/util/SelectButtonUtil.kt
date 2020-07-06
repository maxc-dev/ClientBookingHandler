package dev.maxc.ui.util

import dev.maxc.App
import javafx.scene.image.Image

object SelectButtonUtil {
    fun addButtonClickListener(paneButton: PaneButton) {
        paneButton.pane.setOnMouseReleased {
            paneButton.active = !paneButton.active
            paneButton.imageView.image =
                Image(
                    App::class.java.getResource("/icons/${if (paneButton.active) "" else "un"}checked.png")
                        .toExternalForm()
                )
        }
    }

}