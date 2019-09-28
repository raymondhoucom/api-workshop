org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/todo'
    }
    response {
        status 200
        body([])
    }
}
/*

GET /todos/1 - Should return a 404, as an item does not exist
DELETE /todos/1 - Should return a 404, as an item does not exist
POST /todos - Should return a 201 as the item does not exist
 */

