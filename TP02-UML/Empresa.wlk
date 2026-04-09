
class Empresa {

    var nombreEmpresa
    var cuit
    const empleados
    
//------------------------------------

    method montoTotalSueldoNeto() {
        return empleados.sum({emp => emp.sueldoNeto()})
    }
    
    method montoTotalSueldoBruto() {
        return empleados.sum({emp => emp.sueldoBruto()})
    }
    
    method montoTotalRetenciones() {
        return empleados.sum({emp => emp.retenciones()})
    }

}