package com.example.avancetf.serviceimpl;

import com.example.avancetf.Entities.Cliente;
import com.example.avancetf.negocio.ClienteService;
import com.example.avancetf.repositories.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public Cliente insertarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        if(clienteRepositorio.existsById(id)) {
            clienteRepositorio.deleteById(id);
        }
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        if(clienteRepositorio.existsById(cliente.getId())){
            return clienteRepositorio.save(cliente);
        }
        return null;
    }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

}
