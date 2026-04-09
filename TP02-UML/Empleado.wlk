class Empleado {

    const nombreEmpleado
    var direccion
    var estadoCivil
    var sueldoBasico
    const fechaDeNacimiento 

//------------------------------------
    const añoActual = 2026
//------------------------------------
    method getEdad()            = añoActual - fechaDeNacimiento.year() 
    method getNombre()          = nombreEmpleado 
    method getEstadoCivil()     = estadoCivil
    method getSueldoBasico()    = sueldoBasico  

    method sueldoNeto() {
        return self.sueldoBruto() - self.retenciones()
    }

    method retenciones() {
        return self.obraSocial() + self.aportesJubilatorios()
    }
//------------------------------------
    method obraSocial()
    method aportesJubilatorios()
    method sueldoBruto()

}

class Permanente inherits Empleado {

    var cantHijos
    var antiguedad

//------------------------------------
    const porcentObraSocial = 0.1
    const porcentAporteJub  = 0.15
    const dineroPorHijoAsig = 150
    const dineroPorHijoObra = 20
    const dineroPorConyugue = 100
//------------------------------------


    override method sueldoBruto(){
        return self.getSueldoBasico() + self.salarioFamiliar() 
    }

    override method obraSocial(){
        return (self.sueldoBruto() * porcentObraSocial) + (dineroPorHijoObra * cantHijos)
    }

    override method aportesJubilatorios(){
        return self.sueldoBruto() * porcentAporteJub
    }
//------------------------------------

    method asignacionPorHijo(){
        return dineroPorHijoAsig * cantHijos
    }

    method asignacionPorConyugue() {
        return if(self.esCasado()) dineroPorConyugue else 0
    }

    method salarioFamiliar(){
        return self.asignacionPorHijo() + self.asignacionPorConyugue()
    }

    method esCasado() {
        return (self.getEstadoCivil() == "Casado")
    }
}

class Temporario inherits Empleado {

    var fechaDeSece
    var cantHorasExtras

//------------------------------------
    const precioHorasExtras = 40
    const porcentObraSocial = 0.1
    const porcentAporteJub  = 0.1
    const precionAporteJub  = 5
    const edadBono          = 50
    const dineroBono        = 25
//------------------------------------

    override method sueldoBruto(){
        return self.getSueldoBasico() + (precioHorasExtras * cantHorasExtras)
    }

    override method obraSocial(){
        return (self.sueldoBruto() * porcentObraSocial) + self.bonoPorEdad()
    }

    override method aportesJubilatorios(){
        return (self.sueldoBruto() * porcentAporteJub) + (precionAporteJub * cantHorasExtras)
    }
    
//------------------------------------
    method bonoPorEdad() {
        return if(self.getEdad() > edadBono) dineroBono else 0
    }


}