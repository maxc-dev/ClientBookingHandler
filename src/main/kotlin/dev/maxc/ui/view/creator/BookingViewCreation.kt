package dev.maxc.ui.view.creator

import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 28/06/2020
 */
class BookingViewCreation(parentPane: Pane) : PaneScrollerViewCreation(
    parentPane,
    createView("Name", "client/client_create_name"),
    createView("Contact", "client/client_create_contact"),
    createView("Notes", "client/client_create_notes"),
    createView("Confirm", "client/client_confirm"),
    createView("Confirm", "confirmed", skipProgressBarTab = true)
)