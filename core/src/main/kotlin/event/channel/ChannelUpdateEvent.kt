package dev.kord.core.event.channel

import dev.kord.core.Kord
import dev.kord.core.entity.channel.*
import dev.kord.core.event.Event

/**
 * The event dispatched when a [Channel] is updated.
 *
 * The [old] [Channel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public interface ChannelUpdateEvent : Event {
    public val channel: Channel
    public val old: Channel?
    override val kord: Kord
        get() = channel.kord
}

/**
 * The event dispatched when a [Category] is updated.
 *
 * The [old] [Category] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class CategoryUpdateEvent(
    override val channel: Category,
    override val old: Category?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "CategoryUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when a [DmChannel] is updated.
 *
 * The [old] [DmChannel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class DMChannelUpdateEvent(
    override val channel: DmChannel,
    override val old: DmChannel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "DMChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when a [NewsChannel] is updated.
 *
 * The [NewsChannel] may have been turned into [TextChannel].
 *
 * The [old] [NewsChannel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class NewsChannelUpdateEvent(
    override val channel: NewsChannel,
    override val old: NewsChannel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "NewsChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when a [TextChannel] is updated.
 *
 * The [TextChannel] may have been turned into a [NewsChannel].
 *
 * The [old] [TextChannel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class TextChannelUpdateEvent(
    override val channel: TextChannel,
    override val old: TextChannel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "TextChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when a [VoiceChannel] is updated.
 *
 * The [old] [VoiceChannel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class VoiceChannelUpdateEvent(
    override val channel: VoiceChannel,
    override val old: VoiceChannel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "VoiceChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when a [StageChannel] is updated.
 *
 * The [old] [StageChannel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class StageChannelUpdateEvent(
    override val channel: StageChannel,
    override val old: StageChannel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "StageChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}

/**
 * The event dispatched when an Unknown [Channel] is updated.
 *
 * The [old] Unknown [Channel] may be null unless it has been stored in the cache.
 *
 * @see <a href="https://discord.com/developers/docs/topics/gateway#channel-update">Channel Update</a>
 */
public class UnknownChannelUpdateEvent(
    override val channel: Channel,
    override val old: Channel?,
    override val shard: Int,
    override val customContext: Any?,
) : ChannelUpdateEvent {
    override fun toString(): String {
        return "UnknownChannelUpdateEvent(channel=$channel, old=$old, shard=$shard)"
    }
}
