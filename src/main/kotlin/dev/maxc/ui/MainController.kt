package dev.maxc.ui

import dev.maxc.ui.view.booking.BookingViewCreation
import dev.maxc.ui.view.client.ClientViewCreation
import dev.maxc.ui.view.PaneScrollerViewCreation
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class MainController : Initializable {
    @FXML
    lateinit var userPicDisplay: ImageView

    @FXML
    lateinit var userNameDisplay: Label

    @FXML
    lateinit var userEmailDisplay: Label

    @FXML
    lateinit var contentPane: Pane

    private lateinit var clientViewCreator: ClientViewCreation
    private lateinit var bookingViewCreator: BookingViewCreation
    private lateinit var currentDisplay: PaneScrollerViewCreation

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    @FXML
    fun onUserLogout() {
        //todo(send user to sign in)
    }

    @FXML
    fun onClientCreateRequest() {
        if (!this::clientViewCreator.isInitialized) {
            clientViewCreator = ClientViewCreation(contentPane)
        }
        showView(clientViewCreator)
    }

    @FXML
    fun onBookingCreateRequest() {
        if (!this::bookingViewCreator.isInitialized) {
            bookingViewCreator = BookingViewCreation(contentPane)
        }
        showView(bookingViewCreator)
    }

    private fun showView(view: PaneScrollerViewCreation) {
        currentDisplay = view
        view.show()
    }
}