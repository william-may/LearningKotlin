import java.math.BigDecimal
import java.util.UUID

interface BookingManager {

    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean

    fun systemStatus() = "All Operations are Functional"
}

// Temp so this compiles
class Seat(row: Int, num: Int, price: BigDecimal, description: String ) {}

open class BaseBookingManager(authorizationKey: String): BookingManager {

    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerId: Long) = false

    init {
        if(authorizationKey != "12345") {
            throw UnauthorizedUserException()
        }
    }

}

class AdvancedBookingManager: BaseBookingManager(UUID.randomUUID().toString()), java.io.Closeable {
    override val version = "2.0"

    fun howManyBookings() = 10
    override fun close() {
        TODO("Not yet implemented")
    }
}