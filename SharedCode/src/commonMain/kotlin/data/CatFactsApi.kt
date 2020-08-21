package data

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url

class CatFactsApi {

    private val client = HttpClient()

    suspend fun getCatRandomFact(): String {
        return client.get<String> {
            url(baseUrl)
        }
    }

    companion object {
        private const val baseUrl = "https://cat-fact.herokuapp.com"
    }
}