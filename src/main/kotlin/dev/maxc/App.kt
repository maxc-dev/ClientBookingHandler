package dev.maxc

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class App : Application() {
    override fun start(stage: Stage) {
        val root = Scene(FXMLLoader.load(javaClass.getResource("/root.fxml")))
        root.stylesheets?.add(javaClass.getResource("/style/fontstyle.css").toExternalForm())
        stage.scene = root
        stage.isResizable = false

        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(App::class.java)
        }
    }
}