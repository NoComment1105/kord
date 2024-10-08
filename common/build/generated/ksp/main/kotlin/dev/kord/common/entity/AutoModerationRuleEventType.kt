// THIS FILE IS AUTO-GENERATED BY KordEnumProcessor.kt, DO NOT EDIT!
@file:Suppress(names = arrayOf("RedundantVisibilityModifier", "IncorrectFormatting",
                "ReplaceArrayOfWithLiteral", "SpellCheckingInspection", "GrazieInspection"))

package dev.kord.common.entity

import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode.PUBLICATION
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates in what event context a rule should be checked.
 *
 * See [AutoModerationRuleEventType]s in the
 * [Discord Developer Documentation](https://discord.com/developers/docs/resources/auto-moderation#auto-moderation-rule-object-event-types).
 */
@Serializable(with = AutoModerationRuleEventType.Serializer::class)
public sealed class AutoModerationRuleEventType(
    /**
     * The raw value used by Discord.
     */
    public val `value`: Int,
) {
    public final override fun equals(other: Any?): Boolean = this === other ||
            (other is AutoModerationRuleEventType && this.value == other.value)

    public final override fun hashCode(): Int = value.hashCode()

    public final override fun toString(): String =
            "AutoModerationRuleEventType.${this::class.simpleName}(value=$value)"

    /**
     * An unknown [AutoModerationRuleEventType].
     *
     * This is used as a fallback for [AutoModerationRuleEventType]s that haven't been added to Kord
     * yet.
     */
    public class Unknown(
        `value`: Int,
    ) : AutoModerationRuleEventType(value)

    /**
     * When a member sends or edits a message in the guild.
     */
    public object MessageSend : AutoModerationRuleEventType(1)

    internal object Serializer : KSerializer<AutoModerationRuleEventType> {
        public override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor("dev.kord.common.entity.AutoModerationRuleEventType",
                PrimitiveKind.INT)

        public override fun serialize(encoder: Encoder, `value`: AutoModerationRuleEventType) =
                encoder.encodeInt(value.value)

        public override fun deserialize(decoder: Decoder) = when (val value = decoder.decodeInt()) {
            1 -> MessageSend
            else -> Unknown(value)
        }
    }

    public companion object {
        /**
         * A [List] of all known [AutoModerationRuleEventType]s.
         */
        public val entries: List<AutoModerationRuleEventType> by lazy(mode = PUBLICATION) {
            listOf(
                MessageSend,
            )
        }

    }
}
