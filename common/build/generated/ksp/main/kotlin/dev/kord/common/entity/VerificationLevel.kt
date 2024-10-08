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
 * See [VerificationLevel]s in the
 * [Discord Developer Documentation](https://discord.com/developers/docs/resources/guild#guild-object-verification-level).
 */
@Serializable(with = VerificationLevel.Serializer::class)
public sealed class VerificationLevel(
    /**
     * The raw value used by Discord.
     */
    public val `value`: Int,
) {
    public final override fun equals(other: Any?): Boolean = this === other ||
            (other is VerificationLevel && this.value == other.value)

    public final override fun hashCode(): Int = value.hashCode()

    public final override fun toString(): String =
            "VerificationLevel.${this::class.simpleName}(value=$value)"

    /**
     * An unknown [VerificationLevel].
     *
     * This is used as a fallback for [VerificationLevel]s that haven't been added to Kord yet.
     */
    public class Unknown(
        `value`: Int,
    ) : VerificationLevel(value)

    /**
     * Unrestricted.
     */
    public object None : VerificationLevel(0)

    /**
     * Must have verified email on account.
     */
    public object Low : VerificationLevel(1)

    /**
     * Must be registered on Discord for longer than 5 minutes.
     */
    public object Medium : VerificationLevel(2)

    /**
     * Must be a member of the server for longer than 10 minutes.
     */
    public object High : VerificationLevel(3)

    /**
     * Must have a verified phone number.
     */
    public object VeryHigh : VerificationLevel(4)

    internal object Serializer : KSerializer<VerificationLevel> {
        public override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor("dev.kord.common.entity.VerificationLevel",
                PrimitiveKind.INT)

        public override fun serialize(encoder: Encoder, `value`: VerificationLevel) =
                encoder.encodeInt(value.value)

        public override fun deserialize(decoder: Decoder) = when (val value = decoder.decodeInt()) {
            0 -> None
            1 -> Low
            2 -> Medium
            3 -> High
            4 -> VeryHigh
            else -> Unknown(value)
        }
    }

    public companion object {
        /**
         * A [List] of all known [VerificationLevel]s.
         */
        public val entries: List<VerificationLevel> by lazy(mode = PUBLICATION) {
            listOf(
                None,
                Low,
                Medium,
                High,
                VeryHigh,
            )
        }

    }
}
