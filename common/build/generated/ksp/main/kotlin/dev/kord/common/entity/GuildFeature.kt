// THIS FILE IS AUTO-GENERATED BY KordEnumProcessor.kt, DO NOT EDIT!
@file:Suppress(names = arrayOf("RedundantVisibilityModifier", "IncorrectFormatting",
                "ReplaceArrayOfWithLiteral", "SpellCheckingInspection", "GrazieInspection"))

package dev.kord.common.entity

import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
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

@Serializable(with = GuildFeature.Serializer::class)
public sealed class GuildFeature(
    /**
     * The raw value used by Discord.
     */
    public val `value`: String,
) {
    public final override fun equals(other: Any?): Boolean = this === other ||
            (other is GuildFeature && this.value == other.value)

    public final override fun hashCode(): Int = value.hashCode()

    public final override fun toString(): String =
            "GuildFeature.${this::class.simpleName}(value=$value)"

    /**
     * An unknown [GuildFeature].
     *
     * This is used as a fallback for [GuildFeature]s that haven't been added to Kord yet.
     */
    public class Unknown(
        `value`: String,
    ) : GuildFeature(value)

    /**
     * Guild has access to set an animated guild banner image.
     */
    public object AnimatedBanner : GuildFeature("ANIMATED_BANNER")

    /**
     * Guild has access to set an animated guild icon.
     */
    public object AnimatedIcon : GuildFeature("ANIMATED_ICON")

    /**
     * Guild has set up auto moderation rules.
     */
    public object AutoModeration : GuildFeature("AUTO_MODERATION")

    /**
     * Guild has access to set a guild banner image.
     */
    public object Banner : GuildFeature("BANNER")

    /**
     * Guild can enable welcome screen, Membership Screening, stage channels and discovery, and
     * receives community updates.
     */
    public object Community : GuildFeature("COMMUNITY")

    /**
     * Guild is able to be discovered in the directory.
     */
    public object Discoverable : GuildFeature("DISCOVERABLE")

    /**
     * Guild is able to be featured in the directory.
     */
    public object Featurable : GuildFeature("FEATURABLE")

    /**
     * Guild has access to set an invite splash background.
     */
    public object InviteSplash : GuildFeature("INVITE_SPLASH")

    /**
     * Guild has enabled Membership Screening.
     */
    public object MemberVerificationGateEnabled : GuildFeature("MEMBER_VERIFICATION_GATE_ENABLED")

    /**
     * Guild has enabled monetization.
     */
    public object MonetizationEnabled : GuildFeature("MONETIZATION_ENABLED")

    /**
     * Guild has increased custom sticker slots.
     */
    public object MoreStickers : GuildFeature("MORE_STICKERS")

    /**
     * Guild has access to create announcement channels.
     */
    public object News : GuildFeature("NEWS")

    /**
     * Guild is partnered.
     */
    public object Partnered : GuildFeature("PARTNERED")

    /**
     * Guild can be previewed before joining via Membership Screening or the directory.
     */
    public object PreviewEnabled : GuildFeature("PREVIEW_ENABLED")

    /**
     * Guild has access to create private threads
     */
    public object PrivateThreads : GuildFeature("PRIVATE_THREADS")

    /**
     * Guild is able to set role icons.
     */
    public object RoleIcons : GuildFeature("ROLE_ICONS")

    /**
     * Guild has enabled ticketed events.
     */
    public object TicketedEventsEnabled : GuildFeature("TICKETED_EVENTS_ENABLED")

    /**
     * Guild has access to set a vanity URL.
     */
    public object VanityUrl : GuildFeature("VANITY_URL")

    /**
     * Guild is verified.
     */
    public object Verified : GuildFeature("VERIFIED")

    /**
     * Guild has access to set 384kbps bitrate in voice (previously VIP voice servers).
     */
    public object VIPRegions : GuildFeature("VIP_REGIONS")

    /**
     * Guild has enabled the welcome screen.
     */
    public object WelcomeScreenEnabled : GuildFeature("WELCOME_SCREEN_ENABLED")

    /**
     * Guild has access to use commerce features (i.e. create store channels).
     *
     * @suppress
     */
    @Deprecated(
        level = DeprecationLevel.ERROR,
        message =
                "Discord no longer offers the ability to purchase a license to sell PC games on Discord and store channels were removed on March 10, 2022. See https://support-dev.discord.com/hc/en-us/articles/6309018858647-Self-serve-Game-Selling-Deprecation for more information.",
    )
    public object Commerce : GuildFeature("COMMERCE")

    /**
     * Guild has access to the three-day archive time for threads
     *
     * @suppress.
     */
    @Deprecated(message = "Thread archive durations are no longer boost locked.")
    public object ThreeDayThreadArchive : GuildFeature("THREE_DAY_THREAD_ARCHIVE")

    /**
     * Guild has access to the seven day archive time for threads.
     *
     * @suppress
     */
    @Deprecated(message = "Thread archive durations are no longer boost locked.")
    public object SevenDayThreadArchive : GuildFeature("SEVEN_DAY_THREAD_ARCHIVE")

    internal object Serializer : KSerializer<GuildFeature> {
        public override val descriptor: SerialDescriptor =
                PrimitiveSerialDescriptor("dev.kord.common.entity.GuildFeature",
                PrimitiveKind.STRING)

        public override fun serialize(encoder: Encoder, `value`: GuildFeature) =
                encoder.encodeString(value.value)

        public override fun deserialize(decoder: Decoder) =
                when (val value = decoder.decodeString()) {
            "ANIMATED_BANNER" -> AnimatedBanner
            "ANIMATED_ICON" -> AnimatedIcon
            "AUTO_MODERATION" -> AutoModeration
            "BANNER" -> Banner
            "COMMERCE" -> @Suppress("DEPRECATION_ERROR") Commerce
            "COMMUNITY" -> Community
            "DISCOVERABLE" -> Discoverable
            "FEATURABLE" -> Featurable
            "INVITE_SPLASH" -> InviteSplash
            "MEMBER_VERIFICATION_GATE_ENABLED" -> MemberVerificationGateEnabled
            "MONETIZATION_ENABLED" -> MonetizationEnabled
            "MORE_STICKERS" -> MoreStickers
            "NEWS" -> News
            "PARTNERED" -> Partnered
            "PREVIEW_ENABLED" -> PreviewEnabled
            "PRIVATE_THREADS" -> PrivateThreads
            "ROLE_ICONS" -> RoleIcons
            "SEVEN_DAY_THREAD_ARCHIVE" -> @Suppress("DEPRECATION") SevenDayThreadArchive
            "THREE_DAY_THREAD_ARCHIVE" -> @Suppress("DEPRECATION") ThreeDayThreadArchive
            "TICKETED_EVENTS_ENABLED" -> TicketedEventsEnabled
            "VANITY_URL" -> VanityUrl
            "VERIFIED" -> Verified
            "VIP_REGIONS" -> VIPRegions
            "WELCOME_SCREEN_ENABLED" -> WelcomeScreenEnabled
            else -> Unknown(value)
        }
    }

    public companion object {
        /**
         * A [List] of all known [GuildFeature]s.
         */
        public val entries: List<GuildFeature> by lazy(mode = PUBLICATION) {
            listOf(
                AnimatedBanner,
                AnimatedIcon,
                AutoModeration,
                Banner,
                @Suppress("DEPRECATION_ERROR") Commerce,
                Community,
                Discoverable,
                Featurable,
                InviteSplash,
                MemberVerificationGateEnabled,
                MonetizationEnabled,
                MoreStickers,
                News,
                Partnered,
                PreviewEnabled,
                PrivateThreads,
                RoleIcons,
                @Suppress("DEPRECATION") SevenDayThreadArchive,
                @Suppress("DEPRECATION") ThreeDayThreadArchive,
                TicketedEventsEnabled,
                VanityUrl,
                Verified,
                VIPRegions,
                WelcomeScreenEnabled,
            )
        }

    }
}
