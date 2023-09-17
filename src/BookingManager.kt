import java.util.UUID

interface BookingManager {

    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean

    fun systemStatus() = "All Operations are Functional"
}

// Temp so this compiles
class Seat {}

open class BaseBookingManager(authorizationKey: String): BookingManager {

    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerId: Long) = false

}

class AdvancedBookingManager: BaseBookingManager(UUID.randomUUID().toString()) {
    override val version = "2.0"

    fun howManyBookings() = 10
}