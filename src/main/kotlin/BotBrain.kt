import data.Data
import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.api.objects.Update
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.exceptions.TelegramApiException

class BotBrain : TelegramLongPollingBot() {
    private val startMessage = "Привет, я твой куратор в игре Тайный Санта!\nДля того что бы узнать кто именно тебе попался, введи свой ник.)"
    private val errorMessage = "И че за фигню ты мне пишешь?\n-_-"
    private val notFoundMessage = "Чет нет такого ника...А! Точно!\nУбедись что ты не ошибся в своем нике, так как мой писатель...хмммм....или ленивый...или занятой, можешь написать ему)))"
    var personalData = Data().data()

    override fun getBotUsername() = "wh_newyear_bot"

    override fun getBotToken() = "491105151:AAH031j0mx165E9JHlYbtIYPRKyPUVrNGIU"

    override fun onUpdateReceived(update: Update) {
        if (update.hasMessage()) {
            if (update.message.hasText()) {
                println(update.message.text)
                var ind = 0
                when (update.message.text) {
                    "/start" -> {
                        sendMsg(update.message.chatId, startMessage)
                        ind = 100
                    }
                }
                while (ind < 9) {
                    if (update.message.text == personalData[ind].who) {
                        sendMsg(update.message.chatId, "Ник, который вы должны написать на коробочке или конверте:\n${personalData[ind].whom}")
                        sendMsg(update.message.chatId, "Вот желания этого человека:\n${personalData[ind].description}")
                        ind = 99
                    }
                    ind++
                }
                if (ind != 100) sendMsg(update.message.chatId, notFoundMessage)
            } else sendMsg(update.message.chatId, errorMessage)
        }
    }

    private fun sendMsg(chatId: Long, msg: String) {
        val message = SendMessage()
                .setChatId(chatId)
                .setText(msg)
        try {
            sendMessage(message) // Call method to send the message
        } catch (e: TelegramApiException) {
            e.printStackTrace()
        }
    }
}