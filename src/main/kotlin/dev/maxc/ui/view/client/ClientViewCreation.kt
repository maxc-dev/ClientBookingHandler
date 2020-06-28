package dev.maxc.ui.view.client

import dev.maxc.ui.view.creator.PaneScrollerViewCreation
import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 28/06/2020
 */
class ClientViewCreation(parentPane: Pane) : PaneScrollerViewCreation(
    parentPane,
    createView(
        "Name",
        "client/client_create_name"
    ),
    createView(
        "Contact",
        "client/client_create_contact"
    ),
    createView(
        "Notes",
        "client/client_create_notes"
    ),
    createView(
        "Confirm",
        "client/client_confirm",
        requiresUpdateNotification = true
    ),
    createView(
        "Confirm",
        "confirmed",
        skipProgressBarTab = true
    )
)