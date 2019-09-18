package com.supergrecko.questionbot.commands

import com.supergrecko.questionbot.arguments.QuestionArg
import com.supergrecko.questionbot.extensions.PermissionLevel
import com.supergrecko.questionbot.extensions.permission
import me.aberrantfox.kjdautils.api.dsl.CommandSet
import me.aberrantfox.kjdautils.api.dsl.commands
import me.aberrantfox.kjdautils.internal.arguments.SentenceArg

@CommandSet("core")
fun answerCommands() = commands {
    command("reply") {
        description = "Reply to a question"
        requiresGuild = true
        permission = PermissionLevel.EVERYONE

        expect(QuestionArg, SentenceArg)

        execute {
        }
    }
}
