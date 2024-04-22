import React from 'react';
import {Header03} from "../../src/components/Header";
import {SubHeader02} from "../../src/components/SubHeader";
import Footer from "../../src/components/Footer";
import GetAnimalByIdByMedico from '../../src/components/GetAnimalByIdByMedico';

function GetAnimalByIdBymedicoPage() {
    return (
        <div>
            < Header03 />
            < SubHeader02 />
            < GetAnimalByIdByMedico />
            < Footer />
        </div>
    );
}

export default GetAnimalByIdBymedicoPage;
