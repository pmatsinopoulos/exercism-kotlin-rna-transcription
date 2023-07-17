private val PROTEINS_MAP = mapOf(
    'G' to 'C',
    'C' to 'G',
    'T' to 'A',
    'A' to 'U'
)

fun transcribeToRna(dna: String): String = dna.map { c -> PROTEINS_MAP[c] }.joinToString("")
