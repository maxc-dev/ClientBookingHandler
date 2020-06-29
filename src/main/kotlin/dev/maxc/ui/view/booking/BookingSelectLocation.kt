package dev.maxc.ui.view.booking

import dev.maxc.App
import dev.maxc.ui.view.DataPoint
import dev.maxc.ui.view.ProgressivePane
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class BookingSelectLocation : Initializable, ProgressivePane {
    @FXML
    lateinit var imageLargeHall: ImageView

    @FXML
    lateinit var imageSmallHall: ImageView

    @FXML
    lateinit var imageLodge: ImageView

    @FXML
    lateinit var imageChurch: ImageView

    @FXML
    lateinit var paneLargeHall: Pane

    @FXML
    lateinit var paneSmallHall: Pane

    @FXML
    lateinit var paneLodge: Pane

    @FXML
    lateinit var paneChurch: Pane

    @FXML
    lateinit var promptSelectLocation: Label

    lateinit var buttonPanes: Array<PaneButton>

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        buttonPanes = arrayOf(
            PaneButton(paneLargeHall, imageLargeHall),
            PaneButton(paneSmallHall, imageSmallHall),
            PaneButton(paneLodge, imageLodge),
            PaneButton(paneChurch, imageChurch)
        )

        for (pane in buttonPanes) {
            addButtonClickListener(pane)
        }
    }

    override fun onRequestProgression(): Boolean {
        //returns false unless at least one location is active
        for (pane in buttonPanes) {
            if (pane.active) {
                return true
            }
        }

        return false
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }

    override fun onProgressionDenied() {
        promptSelectLocation.isVisible = true
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }

    @FXML
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

    data class PaneButton(val pane: Pane, val imageView: ImageView, var active: Boolean = false)
}