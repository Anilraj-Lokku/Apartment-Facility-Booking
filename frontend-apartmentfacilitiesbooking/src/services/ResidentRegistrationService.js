import axios from "axios";

class ResidentRegistrationService
{
    URL = "http://localhost:8080/v1/resident"

    fnCreateResident(resident) {
        return axios.post(this.URL+"/register",resident);
    }

    fnGetAllResidents() {
        return axios.get(this.URL);
    }

    fnGetResidentById(id) {
        return axios.get(this.URL+"/"+id);
    }

    fnUpdateResident(id) {
        return axios.put(this.URL+"/"+id);
    }

    //Delete is not working when done in frontend but it is working with postman
    //When deleteing in frontend its giving 403 forbidden error
    fnDeleteResident(id) {
        return axios.delete(this.URL+"/"+id);
    }

}
export default new ResidentRegistrationService;